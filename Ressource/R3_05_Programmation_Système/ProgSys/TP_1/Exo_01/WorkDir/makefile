CXX = g++
CXXFLAGS = -I../Include

SOURCES = File1.cxx File2.cxx
OBJECTS = $(SOURCES:.cxx=.o)
EXECUTABLE = File1.exec

all: $(EXECUTABLE)

$(EXECUTABLE): $(OBJECTS)
	$(CXX) $(CXXFLAGS) -o $@ $^

%.o: %.cxx
	$(CXX) $(CXXFLAGS) -c -o $@ $<

clean:
	rm -f $(EXECUTABLE) $(OBJECTS)

