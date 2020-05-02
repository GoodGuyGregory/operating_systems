import sys
import os
import fileinput


def readTheDisk(commandArgs):

    for line in sys.stdin:
        # Avoids First Line Print

        sys.stdout.write(line[2:])


def main():
    commands = sys.argv
    readTheDisk(commands)


main()
