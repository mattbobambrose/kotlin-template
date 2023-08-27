default: versioncheck

build: clean stage

clean:
	./gradlew clean

build:
	./gradlew build -xtest

stage:
	./gradlew stage

dokka:
	./gradlew dokkaHtml

cleandocs:
	rm -rf docs/playground docs/plotly docs/kroki

versioncheck:
	./gradlew dependencyUpdates

upgrade-wrapper:
	./gradlew wrapper --gradle-version=8.3 --distribution-type=bin