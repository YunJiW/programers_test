package org.example.p46.no1;

// Object 클래스와 equals

class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 22);
        사람 a사람2 = new 사람("홍길동", 22);

        if ( a사람1.equals("ㅋㅋ") )
        {
            System.out.println("거짓1");
        }

        if ( a사람1.equals(a사람2) )
        {
            System.out.println("참1");
        }
    }
}

class 사람 {
    String 이름;
    int 나이;
    사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public boolean equals(Object obj) {
        //사람인지 먼저 체크한다.
        if(obj instanceof 사람 == false)
            return false;

        사람 other = (사람)obj;
        //이름이 같지않다면 다른사람이기떄문에 false를 리턴한다.
        if(!이름.equals(other.이름))
            return false;
        //나이도 다르면 다른사람이다.
        if(this.나이 != other.나이){
            return false;
        }

        return true;
    }
}

