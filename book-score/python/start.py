import pickle
import operator
import time as t

book = []
book_score = {}

def add():
    global book, book_score
    book = []
    
    try:
        with open("save.txt","rb") as fr:
            book_score = pickle.load(fr)
    except: pass

    f = open("list.txt", 'r', encoding='utf-8')

    while True:
        data = f.readline()[:-1]
        
        if not data:
            break
        book.append(data)

    f.close()

    num = len(book)

    for i in range(len(book)):
        if not book[i] in book_score:
            book_score[book[i]] = 0
        book_score[book[i]] += num
        
        num -= 1

    with open("save.txt","wb") as fw:
        pickle.dump(book_score, fw)

def init():
    global book, book_score
    book_score = {}
    
    with open("save.txt","wb") as fw:
        pickle.dump(book_score, fw)

def sort_list():
    global book_score, bdict, result, data
    bdict = sorted(book_score.items(), key=operator.itemgetter(1), reverse=True)
    result = []
    data = ""
    
    for i in range(len(bdict)):
        result.append(bdict[i][0])
        data += bdict[i][0] + "\n"
    with open("result.txt", 'w') as f:
        f.write(data)


init()
while True:
    print("\n"*30)
    print("1.자료추가 2.자료정리")
    u = str(input("입력>>"))
    if u=="1":
        add()
        print("자료가 추가됨")
        t.sleep(2)
    elif u=="2":
        sort_list()
        print("자료가 정리됨.result메모장에서 확인해주십시오")
        t.sleep(2)
        init()
    elif u=="exit()":
        exit()
    
