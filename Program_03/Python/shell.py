import sys
import os



def readTheDisk(commandArgs):
    print("Command Line Arguments Taken:")
    import sys

    for line in sys.stdin:
        sys.stdout.write(line)

        print("Processing....")


def main():
    commands = sys.argv
    readTheDisk(commands)


main()
