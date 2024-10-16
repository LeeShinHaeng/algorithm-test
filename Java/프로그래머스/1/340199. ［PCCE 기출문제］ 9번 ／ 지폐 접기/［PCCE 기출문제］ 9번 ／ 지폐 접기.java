class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        
        if(wallet[0] < wallet[1]){
            int tmp = wallet[1];
            wallet[1] = wallet[0];
            wallet[0] = tmp;
        }
        
        if(bill[0] < bill[1]){
            int tmp = bill[1];
            bill[1] = bill[0];
            bill[0] = tmp;
        }
        
        while(true){
            if(bill[0] <= wallet[0] && bill[1] <= wallet[1]){
                break;
            }
            
            bill[0] = bill[0]/2;
            if(bill[0] < bill[1]){
                int tmp = bill[1];
                bill[1] = bill[0];
                bill[0] = tmp;
            }
            count++;
        }
        
        
        return count;
    }
}