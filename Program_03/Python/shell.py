import sys
import os
import fileinput
import select


def readTheDisk(commandArgs):

    # Checking for Stdin Pipe
    if select.select([sys.stdin], [], [], 0.0)[0]:
        # diskDrive = []
        counter = 0
        print("Displaying Drive Data: ")
        for line in sys.stdin:
            #    Push to Structure to Trim
            # str(line).strip('\n')
            # diskDrive = diskDrive + [line[2:]]
            if counter == 0 or counter == 1:
                counter += 1
            else:

                sys.stdout.write(line[2:])
                counter += 1


def main():
    commands = sys.argv
    readTheDisk(commands)


main()
