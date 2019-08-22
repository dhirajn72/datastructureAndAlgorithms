package cormen;

/**
 * @author Dhiraj
 * @date 26/06/19
 */

/**
 *
 * HashTable data structure using linear probing
 */
public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem noneItem;

    public HashTable(int arraySize) {
        this.arraySize = arraySize;
        hashArray= new DataItem[arraySize];
        noneItem=new DataItem(-1);
    }

    public int hashFunction(int key){
        return key%arraySize;
    }
    public void insert(DataItem item){
        int key=item.getKey();
        int hashValue=hashFunction(key);
        while (hashArray[hashValue]!=null && hashArray[hashValue].getKey()!=-1){
            ++hashValue;
            hashValue=hashValue%arraySize;
        }
        hashArray[hashValue]=item;
    }
    public DataItem delete(int key){
        int hashValue=hashFunction(key);
        while (hashArray[hashValue]!=null){
            if (hashArray[hashValue].getKey()==key){
                DataItem temp=hashArray[hashValue];
                hashArray[hashValue]=noneItem;
                return temp;
            }
            ++hashValue;
            hashValue=hashValue%arraySize;
        }
        return null;
    }
    public DataItem find(int key){
        int hashValue=hashFunction(key);
        while (hashArray[hashValue]!=null){
            if (hashArray[hashValue].getKey()==key){
                return hashArray[hashValue];
            }
            ++hashValue;
            hashValue=hashValue%arraySize;
        }
        return null;
    }

    public void display(){
        for (int i=0;i<arraySize;i++){
            if (hashArray[i]!=null)
                System.out.print(hashArray[i].getKey());
            else
                System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashTable hashTable= new HashTable(5);
        hashTable.insert(new DataItem(20));
        hashTable.insert(new DataItem(21));
        hashTable.insert(new DataItem(22));
        hashTable.insert(new DataItem(26));
        hashTable.insert(new DataItem(30));
        hashTable.display();
        System.out.println(hashTable.find(26).getKey());
    }
}


