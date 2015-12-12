#!/bin/bash
ROOT=$TRAVIS_BUILD_DIR/..

## Build annotation-tools (Annotation File Utilities)
(cd $ROOT && git clone https://github.com/typetools/annotation-tools.git)
# This also builds jsr308-langtools
(cd $ROOT/annotation-tools/ && ./.travis-build-without-test.sh)

## Compile
ant dist