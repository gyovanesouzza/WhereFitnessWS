# Where Fitness 0.1

<h4 align="center"> 
	🚧 🚀 Em construção ...  🚧
</h4>

## Overview

>Nutrition API in Java.

#### Category - Request

- All available categories (GET) 
- Category Creation (POST)
- Category Change (PUT)
```
http://localhost:8081/categories
```

#####Body Parameter
 
| Field     | Type     |
| ---      | ---       |
| Id | Integer |
|name| String |

######Success 200

| Field     | Type     | Description|
| ---      | ---       | ---
| Category | List<Category\>  | A list of all categories available.|

- Category search specify
```
http://localhost:8081/categories/{categoryId}
```

#####Parameter

| Field     | Type     |
| ---      | ---       |
| categoryId | Integer |

######Success 200

| Field     | Type     | Description|
| ---      | ---       | ---
| Category | Object  | Category|
| -  id | Integer | Category unique ID.|
| -  name | String | Category name.|



#### Food - Request
- All available foods(GET)
- Food Creation (POST)
- Food Change(PUT)
```
http://localhost:8081/foods
```

              

- specific food by id
- specific food by description

```
http://localhost:8081/foods/{foodId | description }
```

#####Parameter

| Field     | Type     |
| ---      | ---       |
| foodId | Integer |
| description | String |

######Success 200

| Field     | Type     | Description|
| ---      | ---       | ---
|   id | Integer | Food unique ID.|
|   name | String | Food name.|
|   brand | String | Food brand.|
|   description | String | Food description.|
|   base_qty | Integer ||
|  base_unit | String | |
|   barcode | Integer | Food barcode.|
|   attribute | Object | Food Nutrients.|
| - energy_kcal | Double| energy quantity in kcal|
| - energy_kj| Double|energy quantity in Kj|
| - energy_kj| Double|energy quantity in Kj|
| - humidity_unit| String | |
| - humidity_qty | Double| |
| - protein_unit| String | |
| - protein_qty | Double| |
| - lipid_unit| String | |
| - lipid_qty | Double| |
| - cholesterol_unit| String | |
| - cholesterol_qty | Double| |
| - carbohydrate_unit| String | |
| - carbohydrate_qty | Double| |
| - fiber_unit| String | |
| - fiber_qty | Double| |
| - ashes_unit| String | |
| - ashes_qty | Double| |
| - calcium_unit| String | |
| - calcium_qty | Double| |
| - magnesium_unit| String | |
| - magnesium_qty | Double| |
| - phosphorus_unit| String | |
| - phosphorus_qty | Double| |
| - iron_unit| String | |
| - iron_qty | Double| |
| - sodium_unit| String | |
| - sodium_qty | Double| |
| - potassium_unit| String | |
| - potassium_qty | Double| |
| - thiamine_unit| String | |
| - thiamine_qty | Double| |
| - riboflavin_unit| String | |
| - riboflavin_qty | Double| |
| - pyridoxine_unit| String | |
| - pyridoxine_qty | Double| |
| - niacin_unit| String | |
| - niacin_qty | Double| |
| - retinol_unit| String | |
| - retinol_qty | Double| |
| - fattyAcids_saturated_unit| String | |
| - fattyAcids_saturated_qty | Double| |
| - fattyAcids_monounsaturated_unit| String | |
| - fattyAcids_monounsaturated_qty | Double| |
| - fattyAcids_polyunsaturated_unit| String | |
| - fattyAcids_polyunsaturated_qty | Double| |

#### Meal - Request
- All available Meals(GET)
- Meal Creation (POST)
- Meal Change(PUT)

```
http://localhost:8081/Meal
```
specific Meal

```
http://localhost:8081/Meal/{id}
```
#### Recipe - Request
- All available Recipes(GET)
- Recipe Creation (POST)
- Recipe Change(PUT)
```
http://localhost:8081/Recipe
```
- specific Recipe
```
http://localhost:8081/Recipe/{id}
```

#### TO-DO
