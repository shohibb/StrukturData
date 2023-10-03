class kegiatan1 :
    def reverse(kata):
        reversed_word = ""
        for i in range(len(kata)-1, -1, -1):
            reversed_word += kata[i]
        return reversed_word

    word = input("Masukkan input : ")
    hasil = reverse(word)
    print("Reversed : ",hasil)
