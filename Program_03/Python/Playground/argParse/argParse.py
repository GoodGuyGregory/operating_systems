import argparse

if __name__ == "__main__":
    parser = argparse.ArgumentParser()

# Two Types of args
# Positional and Optional (--<var>)
    parser.add_argument("--number1", help="first number")
    parser.add_argument("--number2", help="second number")
    parser.add_argument("--operation", help="operation",
                        choices=["add", "subtract", "multiply"])
    # Restrict operations with

    args = parser.parse_args()

    # Args is an accessable object which can return commandline arguments
    print(args.number1)
    print(args.number2)
    print(args.operation)

    number1 = int(args.number1)
    number2 = int(args.number2)
    result = None

    if args.operation == "add":
        result = number1 + number2
    elif args.operation == "subtract":
        result = number1 - number2
    elif args.operation == "multiply":
        result = number1 * number2
    else:
        print("unsupported operation")

    print("Result is: " + str(result))
