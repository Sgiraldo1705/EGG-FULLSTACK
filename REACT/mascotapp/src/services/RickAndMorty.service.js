import { API_RM } from '../constants/Api.constants';

class RickAndMortyService {
	async getAllCharacters() {
		const response = await fetch(API_RM.CHARACTERS());
	}
}
