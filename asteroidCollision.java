class Solution {
    
    static boolean is_negative(int number) {

        return number < 0;

    }

    static int sai_ka_abs(int number) {

        return Math.abs(number);

    }

    public int[] asteroidCollision(int[] asteroids) {
        
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < asteroids.length; i++) {
            
            list.add(asteroids[i]);

        }

        for(int x = 0; x < 325; x++) {

            for(int i = 1; i < list.size(); i++) {

                if(is_negative(list.get(i)) && is_negative(list.get(i-1))) {
                    
                    continue;

                }

                if(is_negative(list.get(i)) && !is_negative(list.get(i-1))) {

                    if(sai_ka_abs(list.get(i)) == sai_ka_abs(list.get(i-1))) {

                        list.remove(i);

                        list.remove(i-1);

                        continue;

                    }

                    if(sai_ka_abs(list.get(i)) < sai_ka_abs(list.get(i-1))) {

                        list.remove(i);

                        continue;

                    }

                    if(sai_ka_abs(list.get(i-1)) < sai_ka_abs(list.get(i))) {

                        list.remove(i-1);

                        continue;

                    }

                }

            }

        }

        

        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {

            result[i] = list.get(i);

        }

        return result;

    }

}
