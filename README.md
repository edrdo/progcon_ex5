---
title: Programação Concorrente - Ficha 3
subtitle:
author:
institute:
date:
---

[__Programação Concorrente 2021/22__](https://moodle.up.pt/course/view.php?id=4943), __DCC/FCUP__

[Eduardo R. B. Marques](https://www.dcc.fc.up.pt/~edrdo), DCC/FCUP

## 1
 
Considere a história de ações concorrentes ilustrada pela figura abaixo, identificadas de __a__ a __e__, envolvendo 3 threads e um objecto $v$ do tipo `AtomicInteger`.
 
![](ex1.png)

### 1.1  

Identifique as precedências entre operações na história apresentada. 

### 1.2 

Identifique as linearizações possíveis da história apresentada e para cada uma das linearizações os valores $b_0$ a $b_2$ obtidos (retornados pelas invocações de `compareAndSet`) e o valor guardado em $v$ no final.

### 1.3

Identifique história lineares que possam corresponder a uma execução sequencialmente consistente mas não linearizável da história apresentada e que levem a que:

  - $v$ tenha no final o valor $2$;
  
  - $v$ tenha no final o valor $1$ mas possa assumir antes disso o valor $2$; e
  
  - os valores obtidos em $b_0$, $b_1$, e $b_2$ sejam todos `true` e $v$ tenha no final o valor $4$.

Justifique em cada caso __(i)__ a __(iii)__ porque é que as histórias lineares não correspondem a linearizações.




## 2

Considere a história de ações concorrentes ilustrada pela figura abaixo, envolvendo 3 threads, um objecto `AtomicInteger` $r$ e uma stack $s$. 
Assuma que a operação `pop()` devolve `null` para uma stack vazia.

![](ex2.png)   
  
### 2.1

Identifique as precedências entre ações na história apresentada. 

### 2.2

Para cada uma das condições a seguir, apresente uma linearização para a história dada:
 
  - fica o valor 0 na stack.
  - fica o valor 1 na stack.
  - fica o valor 2 na stack.
  - $x_0 = x_1$.
  - $x_0 \neq x_1$.
  - $x_2 = s.{\rm size}()$
  - $x_2 \neq s.{\rm size}()$
   
### 2.3

Identifique uma história linear que possam corresponder a uma execução sequencialmente consistente com a história apresentada, mas não a uma linearização.

## 3

O resto da aula será dedicado à apresentação do sistema [Cooperari](https://github.com/Cooperari/cooperari).





