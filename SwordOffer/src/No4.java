public class No4 {
    /**
     * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“。
     *
     * @param string     要转换的字符数组
     * @param capacity 数组的最大总容量
     * @return 转换后需要使用的字符长度，-1表示处理失败
     */
    public static int replaceBlank(char[] string, int capacity) {
        if (string ==null||capacity<=0)
            return -1;
        int spacecount = 0;
        int usedspace = 0;
        for (int i=0;i<string.length;i++){
            if (string[i]!='\u0000'){
                usedspace ++;
                System.out.println(usedspace);
                if (string[i]==' ')
                    spacecount++;
            }
            else break ;
        }
        int newlength = usedspace + 2*spacecount;
        System.out.println(newlength);
        if (newlength >capacity)
            return -1;
        int p1 = usedspace -1;
        int p2 = newlength -1;
        while(p1>=0&&p1<=p2){
            if (string[p1]==' '){
                string[p2--] = '0';
                string[p2--] = '2';
                string[p2--] = '%';
            }
            else
                string[p2--] = string[p1];
            p1--;
            //System.out.println(string);
        }
        return newlength;

    }



    public static void main(String[] args) {
        char[] string = new char[50];
        string[0] = ' ';
        string[1] = 'e';
        string[2] = ' ';
        string[3] = ' ';
        string[4] = 'r';
        string[5] = 'e';
        string[6] = ' ';
        string[7] = ' ';
        string[8] = 'a';
        string[9] = ' ';
        string[10] = 'p';
        string[11] = ' ';
        int len = replaceBlank(string, 50);
        System.out.println(len);
        System.out.println(new String(string, 0, len));
    }
}
