import argparse

if __name__ == "__main__":
    parser = argparse.ArgumentParser()

# Two Types of args
# Positional and Optional
    parser.add_argument("number1", help="first number")
    parser.add_argument("number2", help="second number")
    args = parser.parse_args()
