---
title: Installation
description: How to install dependencies and structure your app.
root: .components.layouts.MDLayout
imports:
  - .docs.installation.AutomaticInstallationSteps
  - .docs.installation.ManualInstallationSteps
---

Unlike the official [shadcn/ui](https://ui.shadcn.com) for React, where the components can be added by cli, here we need to just add a dependency in build.gradle to add all of them.

## Automatic Installation

{{{ AutomaticInstallationSteps() }}}

That's it. You can now run the site through `kobweb run`

## Manual Installation

{{{ ManualInstallationSteps() }}}

That's it. You can now use shadcn components in your project.