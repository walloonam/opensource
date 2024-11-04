# 베이스 이미지 선택 (alpine은 가볍고 간단히 사용하기에 적합)
FROM alpine:latest

# 기본 쉘을 사용하여 스크립트 작성
SHELL ["/bin/sh", "-c"]

# 로그를 출력하는 스크립트 추가
RUN echo '#!/bin/sh' > /print_log.sh && \
    echo "echo '2024-10-21T02:05:42.824Z ERROR 219251 --- [dp3] [nio-8080-exec-6] c.i.d.v.c.web.GlobalExceptionHandler     : StatusCode: 500 INTERNAL_SERVER_ERROR, ExceptionCode: 5001, ExceptionMessage: No static resource restore.'" >> /print_log.sh && \
    echo "echo 'org.springframework.web.servlet.resource.NoResourceFoundException: No static resource restore.'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.resource.ResourceHttpRequestHandler.handleRequest(ResourceHttpRequestHandler.java:585)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter.handle(HttpRequestHandlerAdapter.java:52)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:903)'" >> /print_log.sh && \
    echo "echo ' at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885)'" >> /print_log.sh && \
    echo "echo ' at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:195)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140)'" >> /print_log.sh && \
    echo "echo ' at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:113)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)'" >> /print_log.sh && \
    echo "echo ' at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:483)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)'" >> /print_log.sh && \
    echo "echo ' at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344)'" >> /print_log.sh && \
    echo "echo ' at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:384)'" >> /print_log.sh && \
    echo "echo ' at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63)'" >> /print_log.sh && \
    echo "echo ' at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:904)'" >> /print_log.sh && \
    echo "echo ' at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1741)'" >> /print_log.sh && \
    echo "echo ' at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)'" >> /print_log.sh && \
    echo "echo ' at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1190)'" >> /print_log.sh && \
    echo "echo ' at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)'" >> /print_log.sh && \
    echo "echo ' at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63)'" >> /print_log.sh && \
    echo "echo ' at java.base/java.lang.Thread.run(Thread.java:840)'" >> /print_log.sh && \
    chmod +x /print_log.sh

# 엔트리포인트로 로그 출력 스크립트를 설정
ENTRYPOINT ["/print_log.sh"]

