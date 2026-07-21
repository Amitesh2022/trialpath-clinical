# TrialPath Clinical

TrialPath is a European clinical-research operations product for coordinating study sites, enrolment progress, quality signals and operational queries without exposing participant identity.

[Watch the verified product demo](docs/demo.webm)

## Business problem and users

Clinical programmes span sites, jurisdictions and data-quality obligations. Study coordinators, site leads, monitors and research managers need a shared view of readiness and delivery while respecting health-data boundaries.

## Key workflows

- Monitor active sites, enrolment, quality and open queries.
- Take ownership of sites requiring attention.
- Search, filter and sort the site portfolio.
- Progress sites through screening, enrolment, review and closure.
- Qualify a new site with validation and risk routing.
- Compare enrolment velocity and query-resolution performance.

## React technical highlights

React 19 composition, React Router, lazy-loaded insights, TanStack Query caching, persisted Zustand domain state, memoised portfolio filtering, controlled forms, responsive CSS and Testing Library coverage.

## Architecture and data flow

TanStack Query owns asynchronous study-health data. Zustand owns typed site records and lifecycle commands. Route views keep transient filters/forms local while deriving presentation state from the shared store.

## Accessibility and responsive behaviour

Native labelled controls, descriptive actions, text-readable statuses and status feedback support keyboard and assistive-technology use. Dense operations layouts collapse for mobile work.

## Run and verify

```bash
npm ci
npm run lint
npm test
npm run build
npm run dev
```

## Structure

- `src/App.tsx` — routed research workflows
- `src/store.ts` — persistent site domain state
- `src/App.css` — responsive operations system
- `src/App.test.tsx` — integration test

## Tradeoffs and roadmap

Records are illustrative. Production evolution includes role-based identity, CTMS/eTMF integration, consent-aware data access, audit events, query workflows, safety escalation and cross-border research APIs.
