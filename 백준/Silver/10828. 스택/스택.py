import sys

stack = []

def main():
  n = int(sys.stdin.readline())
  results = []
  
  for _ in range(n):
    command = sys.stdin.readline().strip()
    if command.startswith("push"):
      _, x = command.split()
      stack.append(int(x))
    elif command == "pop":
      results.append(stack.pop() if stack else -1)
    elif command == "size":
      results.append(len(stack))
    elif command == "empty":
      results.append(0 if stack else 1)
    elif command == "top":
      results.append(stack[-1] if stack else -1)

  sys.stdout.write("\n".join(map(str, results)) + "\n")

if __name__ == "__main__":
  main()