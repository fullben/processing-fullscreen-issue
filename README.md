# Processing Fullscreen Issue

This is the basic setup to evaluate a bug when trying to run a Processing-based application in fullscreen mode.

## Getting Started

**Note that the following instructions will only work for Windows. Step 2.ii will be different for other operating systems.**

1. Go to the [Processing download page](https://processing.org/download) and get a newer Processing version (minimum 4.2), unpack the downloaded archive (if you have this version installed already, you may skip this step)
2. In the unzipped folder, navigate to `core/library`
   1. Copy `core.jar`, `gluegen-rt.jar`, and `jogl-all.jar` to `<PROJECT_ROOT>/libs/processing`
   2. Copy the `windows-amd64` folder to `<PROJECT_ROOT>/natives`

## Reproducing the Bug

Once the project has been configured properly, all that needs to be done is to run the `main` method of the `FullscreenApp` class. This should result in an application window appearing, that only occupies a part of the screen it is being displayed on.
