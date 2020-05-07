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
parser.add_argument(
    '-d', '-dir', '--directory', help="this will list all the files on the disk", action="store_true")
parser.add_argument('-f', '--file', help="display drive contents", type=str)


args = parser.parse_args()


def fileCheck(inFile):
    print("Checking File Validity...")
    # FILE CHECKING LOGIC
    cwdForProgram = os.getcwd()
    # Shows the Working Directory
    # print(cwdForProgram)
    # Get Command Line Args
    FileinQuestion = inFile
    pathtoFile = os.path.join(cwdForProgram, FileinQuestion)
    # print(pathtoFile)
    results = os.path.exists(pathtoFile)
    # print(results)
    return results


def readTheDisk(commandArgs):
    # Checking for Stdin Pipe
    if select.select([sys.stdin], [], [], 0.0)[0]:
        # print("Found File from Std.in")
        counter = 0
        # print("Displaying Drive Data: ")
        for line in sys.stdin:
            if counter == 0 or counter == 1:
                counter += 1
            else:
                sys.stdout.write(line[2:])
                driveData.append(line[2:])
                counter += 1

        if args.directory:
            print()
            print("Finding Directories ")
            diskParse(driveData)

    else:
            # Checking for File Args
            # print("pre File check")
        if fileCheck(commandArgs.file):
                # Checks for File to use
            print("File Found to be valid:")
            fileName = open(commandArgs.file)
            counter = 0
            print("Displaying Drive Data: ")
            for line in fileName:
                # skip header lines of drive
                if counter == 0 or counter == 1:
                    counter += 1
                else:
                    sys.stdout.write(str(line[2:]))
                    driveData.append(line[2:])
            print()
            if args.directory:
                diskParse(driveData)
        else:
            print("File Not Found, Please Enter a File that Exists")

# Confirm Load


def diskCheck(disk):
    for line in disk:
        sys.stdout.write(line)


def diskParse(driveFile):
    return print("Searching Disk Contents")


def main():

    commands = sys.argv
    # print(commands)
    # Checking for files or Arguments
    if select.select([sys.stdin], [], [], 0.0)[0]:
        # print("Have data!")
        readTheDisk(commands)
    elif args.file != None:
        readTheDisk(args)
    else:
        # print("No Args")
        parser.print_help(sys.stderr)
        sys.exit(1)


driveData = []
main()
