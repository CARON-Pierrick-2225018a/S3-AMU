COMPILER = g++ -c -I../Include
$(nom).exec:    $(nom).o libSys.a
	g++ -o $(nom).exec $(nom).o libSys.a
$(nom).o:       $(nom).cxx ../Include/notreEntete.h
	$(COMPILER) $(nom).cxx
libSys.a:       File2.cxx ../Include/notreEntete.h
	$(COMPILER) File2.cxx;
	ar -cqs libSys.a File2.o ; 
	rm File2.o
clean: 
	 rm *.o File1.exec
