# TrialPath Clinical

TrialPath helps research teams organise clinical study locations and follow their progress.

[Watch the product demo](docs/demo.webm)

## Business problem and users

TrialPath helps research teams organise clinical study locations and follow their progress. It is useful for study coordinators, research managers, and teams working at clinical study sites.

## Key workflows

- See active research sites.
- Review enrolment and quality progress.
- Find sites that need attention.
- Give work to a responsible person.
- Add and review a new site.
- Follow a site until its work is complete.

## React highlights

The product uses React to show separate pages, forms, lists, and live updates. Shared information stays consistent when the user moves between pages. Automated checks confirm that important screens still work.

## Architecture and state flow

The product is split into clear pages. Shared information is kept in one central place, while each page manages only the search box, filters, or form currently being used. A user action updates the shared information and every related page shows the new result.

## Accessibility and responsive behaviour

Buttons, forms, and links can be used with a keyboard. Labels explain what each field does, and important information is shown with words, not only colours. The layout also adjusts for tablets and phones.

## Run and verify

These commands install the project, check it, and start it on a computer:

```bash
npm ci
npm run lint
npm test
npm run build
npm run dev
```

## Structure

- `src/` — the product pages, actions, and design.
- `docs/demo.webm` — a short video showing the product.
- `package.json` — the commands and packages needed to run it.
- `README.md` — this simple product guide.

## Tradeoffs and roadmap

This project uses sample information and does not connect to a real company system. A future version could connect to secure research systems, add site roles, document review, and study alerts.
