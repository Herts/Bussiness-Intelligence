## Apriori Alogrithm

### Basic Concepts:

$$ Support = P(AB) = \frac{frequency_{AB}}{totoal} $$

$$ Confidence = P(A|B) = \frac{P(AB)}{P(A)} $$

Frequent itemsets: Sets of items that have minimum support. Subsets of frequent subsets are frequent.

### Procedure:

1. Find all items that have minimum support, that is, $$ L_1 $$.
2. Find $$ L_k $$ until $$ L_{k+1} $$ is empty:
   - if $$ L_k $$ has one and only one item, terminate.
   - Join to create $$ C_{k+1} $$ and find $$ L_{k+1} $$.

