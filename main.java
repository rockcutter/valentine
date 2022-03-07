import java.util.ArrayList;
class Chocolate{}//おいしい

class Human{//人間クラス
    private ArrayList<Chocolate> receivedChocolates;//複数受け取る可能性があるのでArrayList
    private Chocolate MakesChocolate(){//チョコを作るメソッド
        return new Chocolate();
    }

    public Human(){//コンストラクタ
        this.receivedChocolates = new ArrayList<Chocolate>();
    }

    public void ReceiveChocolate(Chocolate choco){//チョコを受け取って格納するメソッド
        this.receivedChocolates.add(choco);
    }

    public Chocolate GivesChocolate(){//チョコを渡すメソッド
        return this.MakesChocolate();
    }
}

class Main{
    public static void main(final String av[]){
        Human me = new Human();//自分
        Human myGirlFriend = null;//彼女
        boolean valentinesDay = true;//今日はバレンタイン!
        if(valentinesDay){
            me.ReceiveChocolate(myGirlFriend.GivesChocolate());
        }
    }
}