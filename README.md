# Processing Fullscreen Issue

This is the basic setup to evaluate a bug when trying to run a Processing-based application in fullscreen mode.

## Getting Started

**Note that the following instructions will only work for Windows. The steps that need to be performed in the context of other operating systems may differ.**

1. Go to the [Processing download page](https://processing.org/download) and get an older Processing version (e.g. 3.5.3), unpack the downloaded archive (if you have this version installed already, you may skip this step)
2. In the unzipped folder, navigate to `core/library`, and copy all its contents to `<PROJECT_ROOT>/libs/processing`

## Reproducing the Expected Behavior

Once the project has been configured properly, all that needs to be done is to run the `main` method of the `FullscreenApp` class. This should result in an application window appearing, that covers the screen completely.
