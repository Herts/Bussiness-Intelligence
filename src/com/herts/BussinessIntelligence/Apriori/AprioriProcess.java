package com.herts.BussinessIntelligence.Apriori;

import java.io.*;
import java.util.Hashtable;
import java.util.Vector;

public class AprioriProcess {
    int minSupport;
    int confidence;
    int numOfTotalItems;
    int numOfTotalTx;

    String config = "config.txt";
    String txfile = "tx.txt";

    private final int HT = 1;
    private final int IT = 2;

    class HashTreeNode{
        int nodeType;
        int depth;
        Hashtable<String, HashTreeNode> hashtable;
        Vector<ItemSetNode> list;

        public void HashTreeNode(){
            nodeType = HT;
            hashtable = new Hashtable<>();
            list = new Vector<>();
            depth = 0;
        }

        public void HashTreeNode(int i){
            nodeType = i;
            hashtable = new Hashtable<>();
            list = new Vector<>();
            depth = 0;
        }
    }

    class ItemSetNode{
        String itemset;
        int counter;

        public void ItemSetNode(String s, int i) {
            itemset = new String(s);
            counter = i;
        }

        public void ItemSetNode(){
            itemset = new String();
            counter = 0;
        }
    }

    class candidate{
        HashTreeNode htRoot;
        Vector listOfCan;
    }

    public void getConfig() throws IOException
    {
        FileInputStream file    ;
        BufferedInputStream data;
        String line = new String();

        int i = 0;

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

/*        try{
            file = new FileInputStream(config);
            data = new BufferedReader(new InputStreamReader(file));

        } catch (){

        }*/
    }


}
