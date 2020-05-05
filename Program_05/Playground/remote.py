import sys
import os
import fileinput
import select
import argparse

# declare parser class
parser = argparse.ArgumentParser(add_help=False)

parser.add_argument('-v', '-V', action="version",
                    version="version: 1.2.0", help="display version")
parser.add_argument('-h', '-H', '--help', action='help',
                    default=argparse.SUPPRESS, help='show help and usage.')
parser.add_argument('-?', help="show usage", action='help')
parser.add_argument('-f', '--file', help="display drive contents", type=str)
# Checks if there are no Arguments to Parse and Display Usage:
# try:
#     options = parser.parse_args()
# except:
#     parser.print_help()
#     sys.exit(0)


args = parser.parse_args()


def readTheDisk(commandArgs):
    # Checking for Stdin Pipe
    if select.select([sys.stdin], [], [], 0.0)[0]:
        # diskDrive = []
        counter = 0
        print("Displaying Drive Data: ")
        for line in sys.stdin:
            if counter == 0 or counter == 1:
                counter += 1
            else:
                sys.stdout.write(line[2:])
                counter += 1
    else:
        # Checks for File to use
        fileName = open(commandArgs.file)
        counter = 0
        print("Displaying Drive Data: ")
        for line in fileName:
            # skip header lines of drive
            if counter == 0 or counter == 1:
                counter += 1
            else:
                sys.stdout.write(str(line[2:]))


def main():
    commands = sys.argv
    print(commands)
    # Checking for files or Arguments
    if select.select([sys.stdin], [], [], 0.0)[0]:
        print("Have data!")
        readTheDisk(commands)
    elif args.file != None:
        readTheDisk(args)
    else:
        print("No Args")
        parser.print_help(sys.stderr)
        sys.exit(1)


main()
