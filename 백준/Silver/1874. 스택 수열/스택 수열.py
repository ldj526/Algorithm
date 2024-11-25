import sys

def main():
    input = sys.stdin.readline
    n = int(input().strip())
    stack = []
    current = 1
    result = []

    for _ in range(n):
        num = int(input().strip())
        while current <= num:
            stack.append(current)
            result.append("+")
            current += 1
        if stack[-1] == num:
            stack.pop()
            result.append("-")
        else:
            sys.stdout.write("NO\n")
            return

    sys.stdout.write("\n".join(result) + "\n")

if __name__ == "__main__":
    main()