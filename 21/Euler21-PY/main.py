import math


def sumOfDivisors(n):
    divisorsSummed = 1
    for i in range(2, int(math.sqrt(n))):
        if n % i == 0:
            divisorsSummed = divisorsSummed + i + (n / i)

    return int(divisorsSummed)


def isAmicable(a, b):
    return sumOfDivisors(a) == b and sumOfDivisors(b) == a and a != b


def main():
    amicableSummed = 0
    for i in range(1, 10000):
        for j in range(1, 10000):
            if isAmicable(i, j):
                amicableSummed = amicableSummed + i
                print(amicableSummed)
    print(amicableSummed)


if __name__ == '__main__':
    main()
