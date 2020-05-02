import sys
import os


args = sys.argv

for i in range(0,args.__len__()):
    if args[i] == "-v" or args[i] == "-V":
        sys.stdout.write("Version 1.0.0\n")
    if args[i] == "-h" or args[i] == "-H" or args[i] == "-?":
        sys.stdout.write("Version 1.0.0")


def main():
    commands = sys.argv
    
main()