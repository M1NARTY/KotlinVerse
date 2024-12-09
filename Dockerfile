# 기본 Java 이미지 사용
FROM mcr.microsoft.com/vscode/devcontainers/java:11

# 필요한 패키지 설치 (wget, unzip)
RUN apt-get update && apt-get install -y wget unzip

# 코틀린 설치
RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.9.0/kotlin-compiler-1.9.0.zip && \
    unzip kotlin-compiler-1.9.0.zip && \
    mv kotlinc /usr/local/bin && \
    rm kotlin-compiler-1.9.0.zip

# 환경 변수 추가
ENV PATH="/usr/local/bin/kotlinc/bin:${PATH}"
