class myQueue:
    def __init__(self):
        self.data = []
        self.MAX = 100
    
    def size(self):
        return len(self.data)

    def add(self, item):
        if self.size() < self.MAX:
            self.data.append(item)
        elif self.size() > self.MAX:
            raise ValueError
        elif item == 'null':
            return "NullPointerException"

    def offer(self, item):
        if self.size() < self.MAX:
            self.data.append(item)
        else:
            return False

    def remove(self):
        if self.size != 0:
            return self.data.pop(0)
        elif not self.data:
            return "NoSuchElementException"

    def poll(self):
        if self.size != 0:
            return self.data.pop(0)
        elif not self.data:
            return None

    def element(self):
        if self.size != 0:
            return self.data[0]
        elif not self.data:
            return "NoSuchElementException"

    def peek(self):
        if self.size != 0:
            return self.data[0]
        elif not self.data:
            return None
        
if __name__ == '__main__':
    que = myQueue()

    que.add("Java")
    que.add("DotNet")
    que.offer("PHP")
    que.offer("HTML")

    print("remove: ", que.remove())
    print("element: ", que.element())
    print("poll: ", que.poll())
    print("peek: ", que.peek())