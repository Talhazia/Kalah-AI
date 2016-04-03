Teamname=TalhaZia
all: 
	javac -cp Kalah.jar algorithms/$(Teamname).java; \
	java -cp Kalah.jar:. algorithms.$(Teamname)
