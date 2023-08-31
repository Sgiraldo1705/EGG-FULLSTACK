import { API_RM } from '../constants/Api.constants';
export const
class RickAndMortyService {
	async getAllCharacters() {
		const response = await fetch(API_RM.CHARACTERS());
		return response.json();
	}

	async getAllCharactersById() {
		const response = await fetch(API_RM.CHARACTERS_BY_ID());
		return response.json();
	}
}
