package com.amitesh.portfolio.trialpathclinical.service;

import com.amitesh.portfolio.trialpathclinical.api.CreateRecordRequest;
import com.amitesh.portfolio.trialpathclinical.domain.PortfolioRecord;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PortfolioService {
    private final CopyOnWriteArrayList<PortfolioRecord> records = new CopyOnWriteArrayList<>(List.of(
            new PortfolioRecord(UUID.randomUUID(), "Site readiness review", "IN_REVIEW", "Study task", Instant.now()),
            new PortfolioRecord(UUID.randomUUID(), "Enrolment check", "READY", "Study task", Instant.now()),
            new PortfolioRecord(UUID.randomUUID(), "Data query follow-up", "OPEN", "Study task", Instant.now())
    ));

    public List<PortfolioRecord> findAll(String query) {
        if (query == null || query.isBlank()) return List.copyOf(records);
        String needle = query.toLowerCase(Locale.ROOT);
        return records.stream().filter(item -> (item.title() + " " + item.status() + " " + item.note()).toLowerCase(Locale.ROOT).contains(needle)).toList();
    }

    public PortfolioRecord create(CreateRecordRequest request) {
        PortfolioRecord created = new PortfolioRecord(UUID.randomUUID(), request.title().trim(), "OPEN", request.note().trim(), Instant.now());
        records.add(0, created);
        return created;
    }
}
