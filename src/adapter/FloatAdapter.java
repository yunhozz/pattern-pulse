package adapter;

/*
<요구 사항>
1. Float 인자 값을 받아서 수의 두 배를 Float 타입으로 반환하는 twiceOf 메소드 구현
2. Float 인자 값을 받아서 수의 절반을 Float 타입으로 반환하는 halfOf 메소드 구현
3. 구현 객체 명은 FloatAdapter 로 명명
 */

public interface FloatAdapter {
    Float twiceOf(Float f);
    Float halfOf(Float f);
}
