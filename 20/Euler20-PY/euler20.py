import math


def main():
    number = math.factorial(100)
    sum = 0
    for digit in str(number):
        sum += int(digit)
    print(sum)


if __name__ == "__main__":
    main()
