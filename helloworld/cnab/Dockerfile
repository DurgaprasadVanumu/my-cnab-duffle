FROM alpine:3.10.0

RUN apk update
RUN apk add -u bash

COPY Dockerfile /cnab/Dockerfile
COPY app /cnab/app

CMD ["/cnab/app/run"]
