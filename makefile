# Variables
JAVAC = javac
JAVA_FILES = $(wildcard *.java)
CLASS_FILES = $(JAVA_FILES:.java=.class)

# Targets
all: $(CLASS_FILES)

%.class: %.java
	$(JAVAC) $<

clean:
	del /S /Q *.class
