# I love me goth girl titties! they taste like nickle and tin cans though!
# She licked my dick to snuff! Oh what's in your head

# Define the Java source files
SRC = RClock/RClock.java RClock/linuxclock.java

# Define the compiled class files
CLASS_FILES = RClock/RClock.class RClock/linuxclock.class

# Define the output name for the final execution
MAIN_CLASS = RClock.linuxclock

# Define the JAR file name
JAR_FILE = RClock.jar

# Java Compiler
JAVAC = javac

# Java runtime
JAVA = java

# Default target: Compile and create the JAR
all: $(JAR_FILE)
	$(JAVA) -jar $(JAR_FILE)

# Compile the Java files
$(CLASS_FILES): $(SRC)
	$(JAVAC) -d . $(SRC)

# Create the JAR file
$(JAR_FILE): $(CLASS_FILES)
	jar cfe $(JAR_FILE) $(MAIN_CLASS) RClock/*.class

# Clean up compiled files and JAR
clean:
	rm -f $(CLASS_FILES) $(JAR_FILE)
