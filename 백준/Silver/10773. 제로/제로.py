import sys

stack = []

def main():
    input = sys.stdin.readline
    k = int(input().strip())
    stack = []

    for _ in range(k):
        num = int(input().strip())
        if num == 0:
            stack.pop()
        else:
            stack.append(num)

    sys.stdout.write(str(sum(stack)) + "\n")

if __name__ == "__main__":
    main()