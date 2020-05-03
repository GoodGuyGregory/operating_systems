import argparse
parser = argparse.ArgumentParser()
parser.add_argument(
    "square", help="display a square of a given number", type=int)
parser.add_argument("-v", "--verbose", action="store_true",
                    help="increase output verbosity")

# The parse_args() method actually returns some data from the options specified, in this case, echo.
args = parser.parse_args()
answer = args.square**2
if args.verbose:
    print("the square of {} equals {}".format(args.square, answer))
else:
    print(answer)
