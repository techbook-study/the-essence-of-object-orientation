# ch2. 이상한 나라의 객체

소프트웨어 내의 객체의 특성은 크게 상태, 행동, 식별자로 나뉜다.

- 상태 : 단순한 값(속성)과 객체의 조합으로 결정
- 행동 : 객체의 상태를 변경하는 메서드(?)
- 식별자 : 객체를 구별할 수 있는 특정한 속성

예)

```
@Entity
public class Korean

    //속성1
    @Id //식별자
    private Long juminBunho;

    //속성2
    private String name;

    //속성3
    private String male;
```

캡슐화는 객체 내부의 상태를 노출하지 않는것  
객체의 상태에 접근하지 않고 객체의 행동만을 전달해 협력한다. 
- 상태를 외부에 노출하지 않는 것은 객체의 자율성을 높여준다.

***

객체를 설계할때 상태를 결정하고 행동을 결정하는 방법은 좋지않다.
1. 상태를 먼저 결정할 경우 캡슐화가 저해된다.
2. 객체를 협력자가 아닌 고립된 섬으로 만든다.
3. 객체의 재사용성이 저하된다.

즉 상태에 초점을 맞춘 객체는 객체간의 협력을 우선으로 한 객체지향 설계가 아니게 된다.

객체지향은 현실의 객체를 소프트웨어에서 구현한것
모방하는 것이 아닌 은유적인 창조

<br>

***
## ..생각해본점 

캡슐화에 대해 생각해본다면 객체의 상태에 접근하지 않고 행동만을 전달한다고 표현한다.  
캡슐화 되어있지 않은 객체는 무엇일까 라고 생각해보았다.

예)  
```
만약 객체가 다른 객체의 상태를 알고있고 변경해버리는 메서드를 갖게 된다면?

- 바리스타가 제조한 '커피'를 캐시어에게 전달한 후 이걸 '주스'라고 바꿔버린다면
- 고객이 3000원인 아메리카노를 1500원이라고 바꾼 메서드를 전달하게 된다면
```
캡슐화가 되어있지 않는 객체와 객체의 상태를 변경하는 행동을 가진 시스템은 객체지향적인 설계라고 볼 수 없다.
