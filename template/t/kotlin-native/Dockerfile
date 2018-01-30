FROM kikitux/kotlin-native:0.5 as builder
ENV PATH "${PATH}:/usr/local/kotlin-native-linux-0.5/bin"

RUN mkdir -p /root/src/function
WORKDIR /root/src/function
COPY ./function .
WORKDIR /root/src/
COPY ./CMakeLists.txt ./main.kt /root/src/
RUN cmake .
RUN make

FROM ubuntu:latest
COPY --from=builder /root/src/Main.kexe  .
ADD https://github.com/openfaas/faas/releases/download/0.6.9/fwatchdog /
RUN chmod +x /fwatchdog

ENV fprocess="/Main.kexe"
EXPOSE 8080
CMD ["/fwatchdog"]

