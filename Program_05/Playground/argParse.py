import os
import sys
import argparse

# declare parser class

parser = argparse.ArgumentParser(add_help=False)

parser.add_argument('-v', '-V', help="displays version", action="store_true")
parser.add_argument('-h', '-H', '-?', action='help',
                    default=argparse.SUPPRESS, help='show help and usage.')
parser.add_argument('-file',
                    help="display drive contents", type=str)
args = parser.parse_args()


def fileCheck(inFile):
    # FILE CHECKING LOGIC
    cwdForProgram = os.getcwd()
    # Shows the Working Directory
    print(cwdForProgram)
    # Get Command Line Args
    FileinQuestion = inFile
    print(FileinQuestion)
    pathtoFile = os.path.join(cwdForProgram, FileinQuestion)
    print(pathtoFile)
    # Check if it is a file
    return os.path.isfile(pathtoFile)


def main():

    # FILE CHECKING LOGIC
    # cwdForProgram = os.getcwd()
    # print(cwdForProgram)
    # Get Command Line Args
    commands = sys.argv
    # print(commands)
    # pathtoFile = os.path.join(cwdForProgram, commands[1])
    # print(pathtoFile)

    # # Check if it is a file
    # print(os.path.isfile(pathtoFile))
    if fileCheck(args.file):
        print("It's a Damn File already!")


# Compiling Correctly:
# python argParse.py -file "localfile.txt"
main()
