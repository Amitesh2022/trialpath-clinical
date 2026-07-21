# TrialPath Clinical

TrialPath helps research teams organise clinical study locations and follow their progress.

## Live demo

[Watch the recorded product demonstration](docs/demo.webm)

This recording shows the real product running and demonstrates its main screens and actions.

## Screenshots

![TrialPath Clinical product screenshot](docs/screenshot.png)

## Main features

- See active research sites.
- Review enrolment and quality progress.
- Find sites that need attention.
- Give work to a responsible person.
- Add and review a new site.
- Follow a site until its work is complete.

## Technology used

- React with TypeScript.
- Vite for local development and production builds.
- Java with Spring Boot for the backend.
- Maven for Java builds.
- Vitest and JUnit for automated checks.

## Installation instructions

You need Node.js 20 or newer, Java 21 or newer, and Maven 3.9 or newer.

Install the frontend packages:

```bash
npm ci
```

Run all automated checks and production builds:

```bash
npm test
npm run build
npm run backend:test
npm run backend:build
```

Start the frontend and Java backend together:

```bash
npm run fullstack
```

Open [http://localhost:5173](http://localhost:5173) for the product. The Java API runs at [http://localhost:8080](http://localhost:8080).

## Commercial licensing/contact

No commercial license is granted automatically. For commercial licensing, integration work, consulting, or partnership enquiries, contact [Amitesh2022 through GitHub](https://github.com/Amitesh2022).

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

## Java backend highlights

The Java backend uses Spring Boot. It provides real API endpoints to list, search, and create study task records. It checks incoming information, returns clear errors, exposes a health check, and includes automated Java tests.

## Architecture and state flow

The browser application calls the Java API on port 8080. The Java service checks the request and keeps the shared product information. After a user creates a record, the API returns the saved result and the browser refreshes the list.

## Accessibility and responsive behaviour

Buttons, forms, and links can be used with a keyboard. Labels explain what each field does, and important information is shown with words, not only colours. The layout also adjusts for tablets and phones.
