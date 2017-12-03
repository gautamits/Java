import java.util.BitSet;
public class BitSetDemo{
    public static void main(String[] args){
        BitSet bits1 = new BitSet(10);
        BitSet bits2 = new BitSet(10);
        
        for(int i=0;i<10;i++){
            if(i%2==0) bits1.set(i);
            if(i%5==0) bits2.set(i);
        }
        System.out.println(bits1);
        System.out.println(bits2);

        System.out.println("");
        bits2.and(bits1);
        System.out.println("bits2 AND bits1 "+bits2);
        bits1.or(bits2);
        System.out.println("bits1 OR bits2 "+bits1);
        bits1.xor(bits2);
        System.out.println("bits1 XOR bits2 "+bits1);
        bits1.andNot(bits2);
        System.out.println("bits1 ANDNOT bits2 "+bits1);
        System.out.println("Other methods are\ncardinality()\nclear()\nclear(index)\nclear(start,end)\nclone()\n(equals(bitset)\nflip(index)\nflip(start,end)\nget(index)\nget(start,end)\nintersects(bitset)\nisEmpty()\nlength()\nnextClearBit()\nnextSetBit()\nor()\nset(index)\nset(index,bool)\nset(start,end)\nsize()\ntoString()\nxor()");

    }
}