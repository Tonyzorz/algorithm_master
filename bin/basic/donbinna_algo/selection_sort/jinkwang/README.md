선택 정렬
-가장 작은 것을 선택해서 제일 앞으로 보내면 어떨까?
ex) 1 10 5 8 7 6 4 3 2 9
 1 10 5 8 7 6 4 3 2 9
 1 2 5 8 7 6 4 3 10 9
 1 2 3 8 7 6 4 5 10 9
 1 2 3 4 7 6 8 5 10 9
 1 2 3 4 5 6 8 7 10 9
 1 2 3 4 5 6 7 8 10 9
 1 2 3 4 5 6 7 8 9 10
 
 (i,j)를 비교하면서 돌면 될 것 같다.
 
 -시간 복잡도(수행시간)
 1 2 3 4 5 6 7 8 9 10 로 만들기 위해
 10 + 9 + 8 + ... + 1 번 비교 한다
 등차 수열 이므로
 => 10 * (10 + 1) / 2 = 55의 비교 연산을 해야된다.
 => N * (N + 1) / 2
여기서 N이 굉장히 큰수로 가게되면 더하고 나누는것의 의미가 거의 없어진다 그래서 큰수라고 가정하고
컴퓨터는 크게 의미를 부여하지 않고 계산을 하게 된다
그래서 시간 복잡도는 
O(N * N) 로 표기한다.
O(N^2)

만약 정렬해야될 데이터의 개수가 10,000개라면 10,000^2이 걸린다고 할 수 있다.
( 다른 알고리즘과 비교하여 비효율적이다..)

    