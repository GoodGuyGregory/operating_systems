import argparse

# declare parser class

parser = argparse.ArgumentParser(add_help=False)

parser.add_argument('-v', '-V', help="displays version", action="store_true")
parser.add_argument('-h', '-H', '-?', action='help',
                    default=argparse.SUPPRESS, help='show help and usage.')
parser.add_argument('file',
                    help="display drive contents", type=str)
args = parser.parse_args()
