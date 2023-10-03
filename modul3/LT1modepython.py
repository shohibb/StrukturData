class myStack:
    def __init__(self):
        self.data = []

    def size(self):
        return len(self.data)

    def empty(self):
        if self.size == 0:
            return True
        else:
            return False

    def push(self, element):
        self.data.append(element)

    def peek(self):
        if self.empty:
            return self.data[len(self.data)-1]
        else:
            return "Got no elements!"

    def pop(self):
        if self.empty:
            return self.data.pop()

    def search(self, target):
        found = 0
        for i in range(len(self.data)):
            if self.data[i] == target:
                found += 1
        return found

if __name__ == '__main__':
    s = myStack()

    s.push("Aku")
    s.push("Anak")
    s.push("Indonesia")

    print("Next : "+s.peek())
    s.push("Raya")
    print(s.pop())
    s.push("!")

    count = s.search("Aku")
    while count != -1 or count > 1:
        s.pop()
        count -= 1

    print(s.pop())
    print(s.empty())