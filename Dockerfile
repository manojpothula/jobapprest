FROM ubuntu:latest
LABEL authors="manoj"

ENTRYPOINT ["top", "-b"]