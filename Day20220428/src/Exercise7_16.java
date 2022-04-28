/*
 * 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오.)
 * 
 * class Car {} 
 * class FireEngine extends Car implements Movable {} 
 * class Ambulance extends Car {}
 * 
 * FireEngine fe = new FireEngine();
 * 
 * 
 * a. fe instanceof FireEngine   t
 * b. fe instanceof Movable      t
 * c. fe instanceof Object       t
 * d. fe instanceof Car          t
 * e. fe instanceof Ambulance    f
 */

//해설: instanceof 연산자는 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해 true를 반환한다. 
//그래서, FireEngine 인스턴스는 Object, Car, Movable, FireEngine타입에 대해 
//instanceof 연산을 하면 결과로 true를 얻는다. 
//어떤 타입에 대해 instanceof 연산결과가 true라는 것은 그 타입으로 형변환이 가능하다는 것을 뜻한다.